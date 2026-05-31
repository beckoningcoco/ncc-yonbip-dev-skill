# |<<

**变动单明细 (fa_altersheet / nc.vo.fa.alter.AlterSheetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_altersheet | 变动单明细标识 | pk_altersheet | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_alter | 变动单表头标识 | pk_alter | varchar(20) |  | 字符串 (String) |
| 6 | altertype | 变动类型 | altertype | int |  | 整数 (Integer) |
| 7 | item_code | 变动的卡片项目 | item_code | varchar(50) |  | 字符串 (String) |
| 8 | old_value | 变动前的值 | old_value | varchar(50) |  | 字符串 (String) |
| 9 | new_value | 变动后的值 | new_value | varchar(50) |  | 字符串 (String) |
| 10 | local_differ | 本币原值差额 | local_differ | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | differ | 原币原值差额 | differ | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | old_content | 变动前内容 | old_content | varchar(50) |  | 字符串 (String) |
| 13 | old_content_group | 变动前内容(集团) | old_content_group | varchar(50) |  | 字符串 (String) |
| 14 | old_content_global | 变动前内容(全局) | old_content_global | varchar(50) |  | 字符串 (String) |
| 15 | new_content | 变动后内容 | new_content | varchar(50) |  | 字符串 (String) |
| 16 | new_content_group | 变动后内容(集团) | new_content_group | varchar(50) |  | 字符串 (String) |
| 17 | new_content_global | 变动后内容(全局) | new_content_global | varchar(50) |  | 字符串 (String) |