# |<<

**预算控制规则策略 (ntb_id_ctrlTactics / nc.vo.tb.obj.CtrlTacticsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | sys_obj | 业务系统PK | sys_obj | varchar(50) |  | 字符串 (String) |
| 3 | sys_code | 业务系统编码 | sys_code | varchar(50) |  | 字符串 (String) |
| 4 | sys_name | 业务系统名称 | sys_name | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtype | 单据类型PK | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | billtype_code | 单据类型编码 | billtype_code | varchar(50) |  | 字符串 (String) |
| 7 | billtype_name | 单据类型名称 | billtype_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | parentctrltactics | 上游策略主键 | parentctrltactics | varchar(50) |  | 字符串 (String) |
| 9 | actioncode | 单据操作动作编码 | actioncode | varchar(50) |  | 字符串 (String) |
| 10 | actionname | 单据操作动作名称 | actionname | varchar(200) |  | 多语文本 (MultiLangText) |
| 11 | upctdatetype | 上游日期类型 | upctdatetype | varchar(50) |  | 字符串 (String) |
| 12 | rundataadd | 是否执行数增加 | rundataadd | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | rundatareduce | 是否执行数减少 | rundatareduce | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | readydataadd | 是否预占数增加 | readydataadd | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | readydatareduce | 是否预占数减少 | readydatareduce | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | busisystem | 创建系统 | busisystem | varchar(50) |  | 字符串 (String) |
| 19 | createdby | 创建人 | createdby | varchar(20) |  | 用户 (user) |
| 20 | createddate | 创建时间 | createddate | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifiedby | 修改人 | modifiedby | varchar(20) |  | 用户 (user) |
| 22 | modifieddate | 修改时间 | modifieddate | char(19) |  | 日期时间 (UFDateTime) |
| 23 | issystem | 是否系统预置 | issystem | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | isstart | 是否启用 | isstart | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isvirtualaction | 是否虚拟动作 | isvirtualaction | char(1) |  | 布尔类型 (UFBoolean) |