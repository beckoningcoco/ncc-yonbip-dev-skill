# |<<

**批量价格表 (dm_feetariff_bat / nc.vo.dm.tariff.entity.FeeTariffBatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariff_bat | 批量价格表实体 | pk_tariff_bat | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | cpritemid | 价格项子实体 | cpritemid | varchar(20) |  | 价格项子实体 (feeplcy_prc) |
| 5 | cbatlevelid | 批量分级主实体 | cbatlevelid | varchar(20) |  | 批量分级主实体 (batrange) |
| 6 | cbatlevelbid | 批量分级子实体 | cbatlevelbid | varchar(20) |  | 批量分级子实体 (batrange_b) |
| 7 | ibatitemno | 批量分级序号 | ibatitemno | int |  | 整数 (Integer) |
| 8 | iprcitemno | 价格项序号 | iprcitemno | int |  | 整数 (Integer) |
| 9 | nprice | 价格项值 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |