# |<<

**能源产耗 (mm_energy / nc.vo.mmpac.wr.entity.EnergyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_energy | 能源消耗 | pk_energy | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | dept | 部门最新版本 | dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | dept_v | 部门 | dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 8 | accperiod | 会计期间 | accperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | usetype | 能源使用类型 | usetype | varchar(50) |  | 字符串 (String) |
| 10 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | vbillcode | 生产订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 18 | cpmoid | 生产订单 | cpmoid | varchar(20) |  | 主键 (UFID) |
| 19 | vrowno | 生产订单行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 20 | vrowid | 生产订单行 | vrowid | varchar(20) |  | 主键 (UFID) |
| 21 | cbmaterialid | 产品最新版本 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 22 | cbmaterialvid | 产品 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 23 | cdeliverorgid | 发料组织最新版本 | cdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 24 | cdeliverorgvid | 发料组织 | cdeliverorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 25 | coutstockid | 发料仓库编码 | coutstockid | varchar(20) |  | 仓库 (stordoc) |
| 26 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 29 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | fbsourcetype | 来源类型 | fbsourcetype | int |  | 能源产耗来源类型 (enum) |  | 1=自制; |