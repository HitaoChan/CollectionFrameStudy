package com.testenum;

public enum ColoreEnum implements Show{
    // 代表红色
    RED("红色"){
        @Override
        public void show() {
            System.out.println("这是红色");
        }
    },
    // 代表绿色
    GREEN("绿色"){
        @Override
        public void show() {
            System.out.println("这是绿色");
        }
    };

    private final String colorName;

    ColoreEnum(String colorName1) {
        this.colorName = colorName1;
    }

    public String getColorName() {
        return colorName;
    }


}
