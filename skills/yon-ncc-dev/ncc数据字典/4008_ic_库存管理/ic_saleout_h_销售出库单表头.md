# |<<

**销售出库单表头 (ic_saleout_h / nc.vo.ic.m4c.entity.SaleOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2972.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 出库单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cbiztype | 业务流程 | cbiztype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 10 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | trafficorgoid | 物流组织最新版本 | trafficorgoid | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 13 | trafficorgvid | 物流组织 | trafficorgvid | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 14 | cothercalbodyoid | 入库库存组织最新版本 | cothercalbodyoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | cothercalbodyvid | 入库库存组织 | cothercalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | cotherwhid | 入库仓库 | cotherwhid | varchar(20) |  | 仓库 (stordoc) |
| 17 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 19 | cbizid | 业务员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | ccustomerid | 订单客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ntotalweight | 总重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ntotalvolume | 总体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | freplenishflag | 销售退货 | freplenishflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | boutretflag | 销售退回 | boutretflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | vdiliveraddress | 运输地址 | vdiliveraddress | varchar(20) |  | 地址簿 (address) |
| 28 | cdilivertypeid | 运输方式 | cdilivertypeid | varchar(20) |  | 运输方式 (transporttype) |
| 29 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 30 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) | 2 | 1=删除; |