# |<<

**多资金来源 (fa_capitalsource / nc.vo.fa.asset.CapitalSourceViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capitalsource | 资金来源主键 | pk_capitalsource | char(20) | √ | 主键 (UFID) |
| 2 | pk_cardhistory | 卡片历史主键 | pk_cardhistory | varchar(20) |  | 字符串 (String) |
| 3 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_jobmngfil | 项目档案 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 5 | capitalsource | 资金来源 | capitalsource | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 6 | nnum | 金额 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | monthncumnum | 月折旧额 | monthncumnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ncumnum | 累计折旧 | ncumnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | norignalnum | 原始值 | norignalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | percent | 比例 | percent | decimal(28, 8) |  | 数值 (UFDouble) |