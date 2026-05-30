# |<<

**工作中心生产档案 (pd_wk / nc.vo.pd.pd0404.entity.WkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4385.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpdwkid | 工作中心生产档案 | cpdwkid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkid | 工作中心 | cwkid | char(20) | √ | 工作中心 (bd_wk) |
| 6 | ccalendarid | 工作日历 | ccalendarid | char(20) | √ | 工作日历 (workcalendar) |
| 7 | cshiftclassid | 班次类别 | cshiftclassid | char(20) | √ | 班次类别 (bdshifttype) |
| 8 | bprodline | 生产线 | bprodline | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | fcapacitycalc | 能力核算标志 | fcapacitycalc | int | √ | 能力核算标志 (FcapacitycalcEnum) | 0 | 0=产出; |