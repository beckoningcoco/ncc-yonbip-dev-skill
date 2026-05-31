# |<<

**生产计划分解 (mm_plandecomp / nc.vo.mmsop.ppm.plandecomp.entity.PlanDecompVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sopdecomp | 生产计划分解信息 | pk_sopdecomp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmanuplantid | 生产工厂最新版本 | cmanuplantid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | cpdfamid | 产品簇最新版本 | cpdfamid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 13 | taudittime | 审核时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 15 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 18 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | cbegindate | 开始日期 | cbegindate | char(19) |  | 日期 (UFDate) |
| 21 | cenddate | 截止日期 | cenddate | char(19) |  | 日期 (UFDate) |
| 22 | nperiodyear | 工作年 | nperiodyear | int |  | 整数 (Integer) |
| 23 | nperiodcode | 时段编码 | nperiodcode | int |  | 整数 (Integer) |
| 24 | taskid | 任务ID | taskid | varchar(20) |  | 任务管理 (tbb_task) |
| 25 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 29 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 30 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 31 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |