# |<<

**出库申请单表头 (ic_sapply_h / nc.vo.ic.m4455.entity.SapplyBillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 出库申请单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 库存组织最新版本 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | corpvid | 公司版本 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 7 | vtrantypecode | 申请类型编码 | vtrantypecode | varchar(20) | √ | 字符串 (String) |
| 8 | vbillcode | 申请单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | dbilldate | 申请日期 | dbilldate | char(19) | √ | 日期 (UFDate) |
| 10 | cbizid | 申请人 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | cdptid | 申请部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 12 | cdptvid | 申请部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cissueorg | 发料库存组织最新版本 | cissueorg | varchar(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 15 | cissueorg_v | 发料库存组织 | cissueorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 17 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 19 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 20 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 21 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) | 2 | 1=删除; |