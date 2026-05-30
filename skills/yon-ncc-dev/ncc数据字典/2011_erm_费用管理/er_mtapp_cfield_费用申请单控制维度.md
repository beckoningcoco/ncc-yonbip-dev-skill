# |<<

**费用申请单控制维度 (er_mtapp_cfield / nc.vo.erm.mactrlschema.MtappCtrlfieldVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1909.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_cfield | 主键 | pk_mtapp_cfield | char(20) | √ | 主键 (UFID) |
| 2 | pk_tradetype | 费用申请单交易类型 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 3 | fieldcode | 字段编码 | fieldcode | varchar(50) |  | 字符串 (String) |
| 4 | fieldname | 字段名称 | fieldname | varchar(50) | √ | 字符串 (String) |
| 5 | adjust_enable | 可调剂 | adjust_enable | char(1) | √ | 布尔类型 (UFBoolean) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |