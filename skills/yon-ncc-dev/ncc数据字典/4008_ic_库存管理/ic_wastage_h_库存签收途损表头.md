# |<<

**库存签收途损表头 (ic_wastage_h / nc.vo.ic.m4453.entity.WastageHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwastagehid | 签收途损主键 | cwastagehid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cbilltypecode | 单据类型 | cbilltypecode | varchar(4) |  | 字符串 (String) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 11 | vtrantypecode | 签收途损类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 12 | cincorpid | 调入公司最新版本 | cincorpid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 13 | cincorpvid | 调入公司 | cincorpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 14 | cincalbodyid | 调入库存组织最新版本 | cincalbodyid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | cincalbodyvid | 调入库存组织 | cincalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | cinwhid | 调入仓库 | cinwhid | varchar(20) |  | 仓库 (stordoc) |
| 17 | coutcorpid | 调出公司最新版本 | coutcorpid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 18 | coutcorpvid | 调出公司 | coutcorpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 19 | coutcalbodyid | 调出库存组织最新版本 | coutcalbodyid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 20 | coutcalbodyvid | 调出库存组织 | coutcalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 21 | coutwhid | 调出仓库 | coutwhid | varchar(20) |  | 仓库 (stordoc) |
| 22 | fwastpartflag | 途损归属 | fwastpartflag | int | √ | 途损归属 (wastage_part) | 2 | 1=调入方; |