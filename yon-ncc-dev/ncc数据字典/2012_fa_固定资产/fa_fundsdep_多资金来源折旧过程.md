# |<<

**多资金来源折旧过程 (fa_fundsdep / nc.vo.fa.fundsdep.FundsDepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2024.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsdep | 主键 | pk_fundsdep | char(20) | √ | 主键 (UFID) |
| 2 | code | code | code | varchar(50) |  | 字符串 (String) |
| 3 | name | name | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_card | 卡片主键 | pk_card | varchar(50) |  | 字符串 (String) |
| 5 | pk_depgather | 折旧摊销主键 | pk_depgather | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundsource | 资金来源主键 | pk_fundsource | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 7 | pk_usedept | 使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_period | 会计期间 | pk_period | varchar(20) |  | 会计期间档案 (accperiod) |
| 9 | depamout | 折旧金额 | depamout | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | totaldepamout | 卡片累计折旧金额 | totaldepamout | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 12 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 14 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 15 | flag | 标志 | flag | int |  | 整数 (Integer) |
| 16 | orignalvalue | 本币原值 | orignalvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 18 | pk_cardhistory | 卡片历史主键 | pk_cardhistory | varchar(50) |  | 字符串 (String) |
| 19 | pk_capital_source | 资金来源页签主键 | pk_capital_source | varchar(50) |  | 字符串 (String) |
| 20 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |