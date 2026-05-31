# |<<

**HRP出库数据 (hstf_outstockdata / nc.vo.hstf.outstockdata.OutstockDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outstockdata | ID | pk_outstockdata | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 库存单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 3 | pk_warehouse | 仓库 | pk_warehouse | varchar(20) |  | 仓库 (stordoc) |
| 4 | pk_billtype | 出库类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_transtypeid | 库存交易类型 | pk_transtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 11 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 12 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 14 | srcbillhid | 来源单据ID | srcbillhid | varchar(50) |  | 字符串 (String) |
| 15 | datastype | 数据类型 | datastype | int |  | 数据类型 (datatype) |  | 1=新增; |