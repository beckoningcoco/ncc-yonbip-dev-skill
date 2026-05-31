# |<<

**后续业务校验 (pam_nextstep / nc.impl.am.nextstep.NextStepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nextstep | 后续业务主键 | pk_nextstep | char(20) | √ | 主键 (UFID) |
| 2 | bill_type | 单据或交易类型 | bill_type | varchar(30) |  | 字符串 (String) |
| 3 | ck_bill_type | 后续单据或交易类型 | ck_bill_type | varchar(30) |  | 字符串 (String) |
| 4 | ck_bill_name | 后续业务名称 | ck_bill_name | varchar(50) |  | 字符串 (String) |
| 5 | body_metapath | 设备表体路径 | body_metapath | varchar(30) |  | 字符串 (String) |
| 6 | isupdate | 是否修改校验 | isupdate | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | isdelete | 是否删除校验 | isdelete | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | ck_classname | 校验插件类名 | ck_classname | varchar(80) |  | 字符串 (String) |