# |<<

**投标结果记录子表 (pm_tenderresult_b / nc.vo.ptm.tenderresult.TenderResultBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tenderresult_b | 投标结果子表主键 | pk_tenderresult_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | comp_name | 竞争对手名称 | comp_name | varchar(50) |  | 字符串 (String) |
| 6 | comp_offer | 竞争对手投标报价 | comp_offer | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | comp_tech_score | 竞争对手技术标评分 | comp_tech_score | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | comp_winning_bid | 竞争对手中标情况 | comp_winning_bid | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | comp_mny | 竞争对手中标金额 | comp_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |