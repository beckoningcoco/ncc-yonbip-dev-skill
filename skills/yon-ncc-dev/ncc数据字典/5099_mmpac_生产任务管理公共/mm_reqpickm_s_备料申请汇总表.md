# |<<

**备料申请汇总表 (mm_reqpickm_s / nc.vo.mmpac.reqpickm.entity.ReqPickmSumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | creqpickm_sid | 备料申请汇总 | creqpickm_sid | char(20) | √ | 主键 (UFID) |
| 2 | creqpickmid | 备料申请单 | creqpickmid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 7 | cdeliverorgid | 发料组织 | cdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | cdeliverorgvid | 发料组织版本 | cdeliverorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | vprocessno | 工序号 | vprocessno | varchar(20) |  | 字符串 (String) |
| 14 | vbatchcode | 生产批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 15 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 16 | coutstockid | 发料仓库 | coutstockid | varchar(20) |  | 仓库 (stordoc) |
| 17 | cstockmanid | 库管员 | cstockmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | cfeedid | 投料点 | cfeedid | varchar(20) |  | 投料点维护 (bd_wk_feed) |
| 19 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 22 | nrequireastnum | 总需求量 | nrequireastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nrequirenum | 总需求主数量 | nrequirenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nreserveastnum | 总预留量 | nreserveastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nreservenum | 总预留主数量 | nreservenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nreqastnum | 总申请数量 | nreqastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nreqnum | 总申请主数量 | nreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nstockcanastnum | 存量 | nstockcanastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nstockcannum | 库存主数量 | nstockcannum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nnonexecuteastnum | 未执行量 | nnonexecuteastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nnonexecutenum | 未执行主数量 | nnonexecutenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nnetrequireastnum | 净需求量 | nnetrequireastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nnetrequirenum | 净需求主数量 | nnetrequirenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nstockastnum | 备料数量 | nstockastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nstocknum | 备料主数量 | nstocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | naccpendingastnum | 累计待转数量 | naccpendingastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | naccpendingnum | 累计待转主数量 | naccpendingnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | naccstockoutastnum | 累计入库数量 | naccstockoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | naccstockoutnum | 累计入库主数量 | naccstockoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | ddeliverdate | 需用日期 | ddeliverdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 41 | nacctransnum | 累计转库主数量 | nacctransnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nacctransastnum | 累计转库数量 | nacctransastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 44 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 45 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 46 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 47 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 48 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 49 | vstockbatchid | 库存批次 | vstockbatchid | varchar(20) |  | 字符串 (String) |
| 50 | vsstockbatchcode | 库存批次号 | vsstockbatchcode | varchar(40) |  | 字符串 (String) |
| 51 | cinstockid | 供应仓库 | cinstockid | varchar(20) |  | 仓库 (stordoc) |
| 52 | csupplyorgid | 供应组织最新版本 | csupplyorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 53 | csupplyorgvid | 供应组织 | csupplyorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 54 | nunusenum | 未消耗主数量 | nunusenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | nunuseastnum | 未消耗量 | nunuseastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 57 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 58 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 59 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 60 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 61 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 62 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 63 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 64 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 65 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 66 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |