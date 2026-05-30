# |<<

**招标结果子表 (pm_projectbidresult_b / nc.vo.pcm.projectbidresult.ProjectBidResultBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4506.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_probidresult_b | 招标结果子表主键 | pk_probidresult_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 6 | mark | 评分 | mark | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | bidflag | 中标 | bidflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bidreason | 中标理由 | bidreason | varchar(200) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | bid_global | 无税投标额（全局币） | bid_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | bid_group | 无税投标额（集团币） | bid_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | bid_mny | 无税投标额 | bid_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | bid_taxmny | 含税投标额 | bid_taxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |