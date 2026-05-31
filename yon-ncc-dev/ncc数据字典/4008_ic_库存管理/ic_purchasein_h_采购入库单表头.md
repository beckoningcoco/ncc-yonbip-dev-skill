# |<<

**采购入库单表头 (ic_purchasein_h / nc.vo.ic.m45.entity.PurchaseInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 入库单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cbiztype | 业务流程 | cbiztype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 8 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 12 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | cdptid | 采购部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdptvid | 采购部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | cbizid | 采购员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ntotalweight | 总重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ntotalvolume | 总体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | freplenishflag | 采购退库 | freplenishflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bitinbill | 进口入库单 | bitinbill | char(1) |  | 布尔类型 (UFBoolean) | N |
| 22 | ccustomerid | 收货客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 24 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 25 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) | 2 | 1=删除; |