# |<<

**生产报告统计 (mm_wrs / nc.vo.mmpac.wr.wrs.entity.WrsBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | mobillno | 生产订单号 | mobillno | varchar(50) |  | 字符串 (String) |
| 5 | mobillrowno | 生产订单行号 | mobillrowno | varchar(50) |  | 字符串 (String) |
| 6 | material | 物料 | material | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | material_v | 物料版本 | material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | unit | 主单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 9 | astunit | 单位 | astunit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | cdeptid | 生产部门最新 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | cdeptvid | 生产部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 13 | finishnum | 完工主数量 | finishnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | finishastnum | 完工数量 | finishastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | finishvalue | 完工产值 | finishvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | instocknum | 入库主数量 | instocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | instockastnum | 入库数量 | instockastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | instockvalue | 入库产值 | instockvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 20 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 21 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 22 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |