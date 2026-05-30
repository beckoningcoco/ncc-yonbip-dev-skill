# |<<

**销售大屏 (so_dashboard / nc.vo.so.dashboard.entity.SODashBoardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_so_dashboard | 销售大屏汇总表主键 | pk_so_dashboard | char(20) | √ | 主键 (UFID) |
| 2 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 3 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 4 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cchanneltypeid | 销售渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 9 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 10 | ncontractmny_org | 合同金额_组织本币 | ncontractmny_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ncontractmny_group | 合同金额_集团本位币 | ncontractmny_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | noutmny_org | 出库金额_组织本币 | noutmny_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | noutmny_group | 出库金额_集团本位币 | noutmny_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ninvmny_org | 开票金额_组织本币 | ninvmny_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ninvmny_group | 开票金额_集团本位币 | ninvmny_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nreceivedmny_org | 回款金额_组织本币 | nreceivedmny_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nreceivedmny_group | 回款金额_集团本位币 | nreceivedmny_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 19 | lastts | 上次抽取到ts | lastts | char(19) |  | 日期时间 (UFDateTime) |
| 20 | nnum | 物料主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nmonth | 月份 | nmonth | int |  | 整数 (Integer) |
| 22 | nyear | 年 | nyear | int |  | 整数 (Integer) |