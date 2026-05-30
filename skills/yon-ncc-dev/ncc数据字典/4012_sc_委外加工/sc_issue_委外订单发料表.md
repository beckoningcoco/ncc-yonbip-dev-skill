# |<<

**委外订单发料表 (sc_issue / nc.vo.sc.m61.entity.SCOrderIssueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5024.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_issue | 委外订单发料表 | pk_issue | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 材料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 3 | pk_srcmaterial | 材料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 6 | cproductorid | 生产厂家 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 7 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 8 | pk_batchcode | 批次档案 | pk_batchcode | char(20) |  | 主键 (UFID) |
| 9 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | acccastnum | 累积发料数量 | acccastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | unitid | 主单位 | unitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | accnnum | 累积发料主数量 | accnnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | accverifycastnum | 累积核销数量 | accverifycastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | accverifynnum | 累积核销主数量 | accverifynnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 25 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |