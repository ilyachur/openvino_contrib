// Copyright (C) 2020-2023 Intel Corporation
// SPDX-License-Identifier: Apache-2.0

package org.intel.openvino.compatibility;

public class Parameter extends IEWrapper {
    public Parameter(long addr) {
        super(addr);
    }

    public int asInt() {
        return asInt(nativeObj);
    }

    public String asString() {
        return asString(nativeObj);
    }

    /*----------------------------------- native methods -----------------------------------*/
    private static native String asString(long addr);

    private static native int asInt(long addr);

    @Override
    protected native void delete(long nativeObj);
}
