# |<<

**人行联行信息 (bd_asslinenum / nc.vo.bd.asslinenum.AssLineNumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/336.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_asslinenum | 主键 | pk_asslinenum | char(20) | √ | 主键 (UFID) |
| 2 | code | 人行联行行号 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 人行联行名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | memo | 备注 | memo | varchar(500) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 8 | lqdationline | 清算行号 | lqdationline | varchar(40) |  | 字符串 (String) |
| 9 | location | 银行网点地址 | location | varchar(200) |  | 字符串 (String) |
| 10 | telephone | 银行网点电话 | telephone | varchar(200) |  | 字符串 (String) |
| 11 | province | 银行网点省份 | province | varchar(200) |  | 字符串 (String) |
| 12 | city | 银行网点城市 | city | varchar(200) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |