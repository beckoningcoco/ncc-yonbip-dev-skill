# |<<

**个税测算结果 (wa_taxforecast / nc.vo.wa.taxforecast.TaxForecastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxforecast | 测算结果主键 | pk_taxforecast | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | monthclass | 月薪薪资方案 | monthclass | varchar(20) | √ | 薪资方案 (WaClassVO) |
| 5 | monthperiod | 月薪薪资期间 | monthperiod | varchar(20) | √ | 薪资期间 (PeriodVO) |
| 6 | monthitem | 月薪计税项目 | monthitem | varchar(20) | √ | 薪资发放项目 (wa_classitem) |
| 7 | yearclass | 年奖薪资方案 | yearclass | varchar(20) | √ | 薪资方案 (WaClassVO) |
| 8 | yearperiod | 年奖薪资期间 | yearperiod | varchar(20) | √ | 薪资期间 (PeriodVO) |
| 9 | yearitem | 年奖计税项目 | yearitem | varchar(20) | √ | 薪资发放项目 (wa_classitem) |
| 10 | monthcount | 年度工作月数 | monthcount | varchar(20) |  | 薪资发放项目 (wa_classitem) |
| 11 | pk_psndoc | 人员基本主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 12 | pk_mwadata | 月度薪资数据主键 | pk_mwadata | varchar(20) |  | 薪资档案 (payfile) |
| 13 | pk_ywadata | 年度薪资数据主键 | pk_ywadata | varchar(20) |  | 薪资档案 (payfile) |
| 14 | permmoney | 原月薪金额 | permmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nowmmoney | 调整后月薪金额 | nowmmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | perymoney | 原年薪金额 | perymoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nowymoney | 调整后年薪金额 | nowymoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | taxtableid | 税率表主键 | taxtableid | varchar(20) |  | 税率表计税基数 (wa_taxbase) |
| 19 | taxtype | 扣税方式 | taxtype | int |  | 扣税方式 (taxtype) |  | 0=代扣税; |