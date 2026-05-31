# |<<

**费用申请单控制单据 (er_mtapp_cbill / nc.vo.erm.mactrlschema.MtappCtrlbillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_cbill | 主键 | pk_mtapp_cbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_tradetype | 费用申请单交易类型 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 3 | src_system | 控制系统 | src_system | varchar(50) |  | 字符串 (String) |
| 4 | src_billtype | 控制单据类型 | src_billtype | varchar(50) |  | 字符串 (String) |
| 5 | src_tradetype | 控制交易类型 | src_tradetype | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_src_tradetype | 控制交易类型PK | pk_src_tradetype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |