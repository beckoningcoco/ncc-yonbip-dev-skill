# |<<

**ID对照表 (xx_idcontrast / nc.vo.pfxx.idcontrast.IDContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_idcontra | 主键 | pk_idcontra | char(20) | √ | 主键 (UFID) |
| 2 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 3 | file_id | 文档id | file_id | varchar(200) |  | 字符串 (String) |
| 4 | sub_mark | 子表标识 | sub_mark | varchar(50) |  | 字符串 (String) |
| 5 | sub_mark_b | 子子表标识 | sub_mark_b | varchar(50) |  | 字符串 (String) |
| 6 | isdelete | 是否删除 | isdelete | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_bill | 单据pk | pk_bill | varchar(50) |  | 字符串 (String) |