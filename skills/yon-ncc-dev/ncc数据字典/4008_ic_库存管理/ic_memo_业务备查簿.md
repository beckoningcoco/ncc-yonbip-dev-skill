# |<<

**业务备查簿 (ic_memo / nc.vo.module.ic_memo.BusiMemo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmemoid | 业务备查簿主键 | cmemoid | char(20) | √ | 主键 (UFID) |
| 2 | cmemosetupid | 业务备查簿设置主键 | cmemosetupid | varchar(20) |  | 业务备查簿设置 (MemoSetup) |
| 3 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 4 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | dbizdate | 业务日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 8 | cbizid | 业务员 | cbizid | varchar(20) |  | 主键 (UFID) |
| 9 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 10 | iappendix | 附件数 | iappendix | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | cuserid | 操作员 | cuserid | int |  | 整数 (Integer) |
| 12 | naddnum | 增方数量 | naddnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | naddmoney | 增方金额 | naddmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ndecreasenum | 减方数量 | ndecreasenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ndecreasemoney | 减方金额 | ndecreasemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | pk_calbody | 库存组织 | pk_calbody | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 18 | corpoid | 公司 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |