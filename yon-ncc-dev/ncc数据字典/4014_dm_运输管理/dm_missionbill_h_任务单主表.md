# |<<

**任务单主表 (dm_missionbill_h / nc.vo.dm.m4806.entity.MissionBillHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1735.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmissionbill_hid | 任务单表头主键 | cmissionbill_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 任务单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 5 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 6 | crouteid | 运输路线 | crouteid | varchar(20) |  | 运输路线 (dm_route) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | cdeptid | 部门版本信息 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cdeptvid | 运输部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | cdelivbill_hid | 对应运输单 | cdelivbill_hid | varchar(20) |  | 运输单主表 (delivbill) |
| 11 | vdelivbillcode | 对应运输单单据号 | vdelivbillcode | varchar(40) |  | 字符串 (String) |
| 12 | cdriverid | 司机 | cdriverid | varchar(20) |  | 司机定义 (dm_driver) |
| 13 | cvehicleid | 车辆 | cvehicleid | varchar(20) |  | 车辆定义 (dm_vehicle) |
| 14 | varriveaddrid | 到达地址 | varriveaddrid | varchar(50) |  | 字符串 (String) |
| 15 | nauditmile | 审核里程 | nauditmile | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | noilconsum | 油耗 | noilconsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | baccountflag | 已报帐 | baccountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | noutmile | 出车时里程表 | noutmile | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ninmile | 收车时里程表 | ninmile | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 21 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 22 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 23 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 24 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 25 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 26 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (fstatusflag) |  | 0=自由; |