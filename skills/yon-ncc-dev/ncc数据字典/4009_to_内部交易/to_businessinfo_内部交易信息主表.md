# |<<

**内部交易信息主表 (to_businessinfo / nc.vo.to.businessinfo.entity.BusinessinfoHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5786.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbusinessid | 主表 | cbusinessid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | coutstockorgid | 调出库存组织最新版本 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | coutstockorgvid | 调出库存组织 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_org | 调出财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 调出财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | cinfinanceorgid | 调入财务组织最新版本 | cinfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | cinfinanceorgvid | 调入财务组织 | cinfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | cinstockorgid | 调入库存组织最新版本 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 10 | cinstockorgvid | 调入库存组织 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | ccurrencyid | 原币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 12 | breverseflag | 反向结算 | breverseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | csettlepathid | 结算路径 | csettlepathid | varchar(20) |  | 结算路径主表 (to_settlepath) |
| 14 | bunilateralflag | 单边结算 | bunilateralflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | fonwayownerflag | 在途归属 | fonwayownerflag | int |  | 在途归属 (OnWayOwner) |  | 1=归调出方; |