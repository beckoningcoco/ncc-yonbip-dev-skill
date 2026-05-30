# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwholepackid | cwholepackid | cwholepackid | char(20) | √ |
| 2 | cmaterialclass | cmaterialclass | cmaterialclass | varchar2(20) |  |  | '~' |
| 3 | cmaterialoid | cmaterialoid | cmaterialoid | char(20) |
| 4 | cmaterialvid | cmaterialvid | cmaterialvid | char(20) |
| 5 | cpackageunit | cpackageunit | cpackageunit | varchar2(20) |  |  | '~' |
| 6 | cpacktypeid | cpacktypeid | cpacktypeid | varchar2(20) |
| 7 | defpackage | defpackage | defpackage | char(1) |
| 8 | npackagenum | npackagenum | npackagenum | number(28, 8) |
| 9 | npacknum | npacknum | npacknum | number(28, 8) |
| 10 | nsinglegrossweight | nsinglegrossweight | nsinglegrossweight | number(20, 8) |
| 11 | nsinglesuttleweight | nsinglesuttleweight | nsinglesuttleweight | number(28, 8) |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |