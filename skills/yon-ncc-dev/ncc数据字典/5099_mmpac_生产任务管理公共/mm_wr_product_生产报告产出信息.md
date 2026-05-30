# |<<

**生产报告产出信息 (mm_wr_product / nc.vo.mmpac.wr.entity.WrItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3799.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_product | 生产报产出信息 | pk_wr_product | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbrowno | 行号 | vbrowno | varchar(20) |  | 字符串 (String) |
| 6 | cbmoid | 生产订单 | cbmoid | char(20) |  | 主键 (UFID) |
| 7 | vbmobillcode | 生产订单号 | vbmobillcode | varchar(40) |  | 字符串 (String) |
| 8 | cbmobid | 生产订单行 | cbmobid | char(20) |  | 主键 (UFID) |
| 9 | vbmorowno | 生产订单行号 | vbmorowno | varchar(20) |  | 字符串 (String) |
| 10 | vbmoparentbillcode | 上级生产订单号 | vbmoparentbillcode | varchar(40) |  | 字符串 (String) |
| 11 | cbfirstmoid | 源头生产订单 | cbfirstmoid | char(20) |  | 主键 (UFID) |
| 12 | vbfirstmocode | 源头生产订单号 | vbfirstmocode | varchar(40) |  | 字符串 (String) |
| 13 | cbfirstmobid | 源头生产订单行 | cbfirstmobid | char(20) |  | 主键 (UFID) |
| 14 | vbfirstmorowno | 源头生产订单行号 | vbfirstmorowno | varchar(20) |  | 字符串 (String) |
| 15 | cbsrcmoid | 来源生产订单 | cbsrcmoid | char(20) |  | 主键 (UFID) |
| 16 | vbsrcmocode | 来源生产订单号 | vbsrcmocode | varchar(40) |  | 字符串 (String) |
| 17 | cbsrcmobid | 来源生产订单行 | cbsrcmobid | char(20) |  | 主键 (UFID) |
| 18 | vbsrcmorowno | 来源生产订单行号 | vbsrcmorowno | varchar(20) |  | 字符串 (String) |
| 19 | fbproducttype | 产品类型 | fbproducttype | int |  | 产出类型 (outputtype) |  | 1=主产品; |