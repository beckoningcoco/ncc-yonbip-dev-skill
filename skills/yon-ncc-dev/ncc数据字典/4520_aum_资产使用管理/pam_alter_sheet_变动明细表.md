# |<<

**变动明细表 (pam_alter_sheet / nc.vo.aum.alter.AlterSheetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4217.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter_sheet | 变动明细主键 | pk_alter_sheet | char(20) | √ | 主键 (UFID) |
| 2 | item_code | 变动项目 | item_code | varchar(100) |  | 字符串 (String) |
| 3 | old_content | 原值 | old_content | varchar(100) |  | 字符串 (String) |
| 4 | new_content | 新值 | new_content | varchar(100) |  | 字符串 (String) |