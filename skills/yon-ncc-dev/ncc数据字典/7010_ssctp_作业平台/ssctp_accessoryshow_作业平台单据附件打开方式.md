# |<<

**作业平台单据附件打开方式 (ssctp_accessoryshow / nc.vo.ssctp.dooroad.DRAccessoryShowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accessoryshow | 唯一标识 | pk_accessoryshow | char(20) | √ | 字符串 (String) |
| 2 | pk_ots | 外系统主键 | pk_ots | varchar(20) |  | 第三方系统档案 (ssctp_ots) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 交易类型 (transtype) |
| 6 | transtype_code | 交易类型编码 | transtype_code | varchar(50) |  | 字符串 (String) |
| 7 | billtype_code | 单据类型编码 | billtype_code | varchar(50) |  | 字符串 (String) |
| 8 | url | 地址 | url | varchar(500) |  | 字符串 (String) |
| 9 | showtype | 显示类型 | showtype | int |  | 显示类型 (showtype) |  | 1=调用第三方地址; |