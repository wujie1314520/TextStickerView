可以拖动，旋转，缩放，删除的文本编辑控件，支持多行文本编辑
# 预览
![image](https://github.com/wujie1314520/TextStickerView/blob/master/screenshot/sc.gif)
# 使用
```java
TextStickerView mTextStickerView = new TextStickerView(this, null);
        mTextList.add(mTextStickerView);
        RelativeLayout.LayoutParams layoutparams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutparams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        mTextStickerView.setLayoutParams(layoutparams);
        mRlContainer.addView(mTextStickerView);
```java