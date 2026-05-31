# |<<

**计划来源反查表头 (mm_plo / nc.vo.mmpps.planbusi.sr.entity.PoSrcReverseHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3730.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpoid | 计划订单 | cpoid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 计划订单号 | vbillcode | varchar(30) |  | 字符串 (String) |
| 6 | cfactoryid | 需求库存组织最新版本 | cfactoryid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | cfactoryvid | 需求库存组织 | cfactoryvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | cpsid | 计划方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 9 | fplanstrategy | 计划策略 | fplanstrategy | varchar(20) |  | 计划策略 (bd_planstrategy) |
| 10 | cplandeptid | 计划部门最新版本 | cplandeptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | cplandeptvid | 计划部门 | cplandeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | cemployeeid | 计划员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 14 | cproddeptid | 生产部门最新版本 | cproddeptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cproddeptvid | 生产部门 | cproddeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 17 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 18 | cbomid | 生产BOM版本号 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 19 | crtid | 工艺路线版本号 | crtid | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 20 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 22 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 23 | ccustomid | 客户 | ccustomid | varchar(20) |  | 客户基本信息 (customer) |
| 24 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 25 | naccponum | 计划投入主数量 | naccponum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nnumber | 计划产出主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 28 | nassaccponum | 计划投入数量 | nassaccponum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nastnum | 计划产出数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 31 | dplanstarttime | 计划开始日期 | dplanstarttime | char(19) |  | 日期(开始) (UFDateBegin) |
| 32 | dbilltime | 下单日期 | dbilltime | char(19) |  | 日期(开始) (UFDateBegin) |
| 33 | drewindtime | 收料日期 | drewindtime | char(19) |  | 日期(结束) (UFDateEnd) |
| 34 | ddemandtime | 需求日期 | ddemandtime | char(19) |  | 日期(结束) (UFDateEnd) |
| 35 | computecode | 运算号 | computecode | varchar(40) |  | 字符串 (String) |
| 36 | fpotype | 计划类型 | fpotype | int |  | 计划类型 (PoTypeEnum) |  | 0=MPS; |