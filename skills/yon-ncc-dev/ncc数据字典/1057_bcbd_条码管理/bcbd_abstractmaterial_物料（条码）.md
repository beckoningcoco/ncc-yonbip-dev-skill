# |<<

**物料（条码） (bcbd_abstractmaterial / nc.vo.bcbd.abstractmaterial.AbstractMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mo | 物料（条码）主键 | pk_mo | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialv | 物料 | cmaterialv | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterial | 物料多版本 | cmaterial | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | cproductor | 生产厂商 | cproductor | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 5 | ccustomer | 客户 | ccustomer | varchar(20) |  | 客户基本信息 (customer) |
| 6 | csupplier | 供应商 | csupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | freeassist6 | 自由辅助属性6 | freeassist6 | varchar(101) |  | 自由项 (Custom) |
| 8 | freeassist7 | 自由辅助属性7 | freeassist7 | varchar(101) |  | 自由项 (Custom) |
| 9 | freeassist8 | 自由辅助属性8 | freeassist8 | varchar(101) |  | 自由项 (Custom) |
| 10 | freeassist9 | 自由辅助属性9 | freeassist9 | varchar(101) |  | 自由项 (Custom) |
| 11 | freeassist10 | 自由辅助属性10 | freeassist10 | varchar(101) |  | 自由项 (Custom) |
| 12 | freeassist11 | 自由辅助属性11 | freeassist11 | varchar(101) |  | 自由项 (Custom) |
| 13 | freeassist12 | 自由辅助属性12 | freeassist12 | varchar(101) |  | 自由项 (Custom) |
| 14 | freeassist13 | 自由辅助属性13 | freeassist13 | varchar(101) |  | 自由项 (Custom) |
| 15 | freeassist14 | 自由辅助属性14 | freeassist14 | varchar(101) |  | 自由项 (Custom) |
| 16 | freeassist15 | 自由辅助属性15 | freeassist15 | varchar(101) |  | 自由项 (Custom) |
| 17 | cassistunit | 辅助单位 | cassistunit | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nassistnum | 辅助数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 21 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 22 | vprodbatchcode | 生产批次号 | vprodbatchcode | varchar(50) |  | 字符串 (String) |
| 23 | vserialcode | 序列号 | vserialcode | varchar(50) |  | 字符串 (String) |
| 24 | project | 项目 | project | varchar(20) |  | 项目 (project) |
| 25 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 26 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 27 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 28 | dinbounddate | 首次入库日期 | dinbounddate | char(19) |  | 日期 (UFDate) |
| 29 | cwk | 工作中心 | cwk | varchar(20) |  | 工作中心 (bd_wk) |
| 30 | factory | 工厂 | factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 31 | producteddept | 生产部门 | producteddept | varchar(20) |  | 组织_部门 (dept) |
| 32 | bc_02 | 单件条码 | bc_02 | varchar(50) |  | 字符串 (String) |
| 33 | bc_01 | 物资码 | bc_01 | varchar(50) |  | 字符串 (String) |