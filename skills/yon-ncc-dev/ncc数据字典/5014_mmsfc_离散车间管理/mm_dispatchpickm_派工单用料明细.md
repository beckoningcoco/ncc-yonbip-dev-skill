# |<<

**派工单用料明细 (mm_dispatchpickm / nc.vo.mmsfc.dispatchlist.entity.DispatchPickmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatchpickm | 派工单用料明细 | pk_dispatchpickm | char(20) | √ | 主键 (UFID) |
| 2 | cpickmid | 备料计划信息 | cpickmid | char(20) |  | 主键 (UFID) |
| 3 | cpickm_bid | 备料计划明细 | cpickm_bid | varchar(20) |  | 备料计划明细 (mm_pickm_b) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | vrowno | 序号 | vrowno | varchar(20) |  | 字符串 (String) |
| 8 | cbunitid | 主单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | cbastunitid | 单位 | cbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vbchangerate | 换算率 | vbchangerate | varchar(60) |  | 字符串 (String) |
| 11 | drequiredate | 需用日期 | drequiredate | char(19) |  | 日期 (UFDate) |
| 12 | nplanoutastnum | 计划出库数量 | nplanoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nplanoutnum | 计划出库主数量 | nplanoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldastnum | 累计待发数量 | nshouldastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nshouldnum | 累计待发主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | naccoutastnum | 累计出库数量 | naccoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | naccoutnum | 累计出库主数量 | naccoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 19 | pk_dispatchlist_b | 派工单明细 | pk_dispatchlist_b | varchar(20) |  | 派工单明细 (mm_dispatchlist_b) |
| 20 | nunituseastnum | 单位用量 | nunituseastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nunitusenum | 单位主用量 | nunitusenum | decimal(28, 8) |  | 数值 (UFDouble) |