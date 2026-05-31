# |<<

**卡片资金来源历史 (fa_capitalsourcehistory / nc.vo.fa.assetcard.CapitalSourceHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capitalsourcehis | 主键 | pk_capitalsourcehis | char(40) | √ | 主键 (UFID) |
| 2 | pk_capitalsource | 资金来源页签主键 | pk_capitalsource | char(20) | √ | 主键 (UFID) |
| 3 | pk_accbook | 账簿主键 | pk_accbook | char(20) | √ | 主键 (UFID) |
| 4 | pk_card | 卡片主键 | pk_card | char(20) | √ | 主键 (UFID) |
| 5 | pk_cardhistory | 卡片历史主键 | pk_cardhistory | char(20) | √ | 主键 (UFID) |
| 6 | pk_fundsource | 资金来源主键 | pk_fundsource | char(20) | √ | 主键 (UFID) |
| 7 | pk_jobmngfil | 项目档案 | pk_jobmngfil | char(20) |  | 主键 (UFID) |
| 8 | nnum | 金额 | nnum | decimal(28, 8) | √ | 数值 (UFDouble) | 0 |
| 9 | nmonthcumnum | 月折旧额 | nmonthcumnum | decimal(28, 8) | √ | 数值 (UFDouble) | 0 |
| 10 | ncumnum | 折旧额 | ncumnum | decimal(28, 8) | √ | 数值 (UFDouble) | 0 |
| 11 | accyear | 会计年 | accyear | varchar(50) | √ | 字符串 (String) |
| 12 | period | 会计月 | period | varchar(50) | √ | 字符串 (String) |
| 13 | addstate | 资产新增 | addstate | char(1) | √ | 布尔类型 (UFBoolean) | N |