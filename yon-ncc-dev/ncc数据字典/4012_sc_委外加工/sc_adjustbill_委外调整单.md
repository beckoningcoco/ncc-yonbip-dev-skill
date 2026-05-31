# |<<

**委外调整单 (sc_adjustbill / nc.vo.sc.m62.entity.AdjustHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5021.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjust | 委外调整单主键 | pk_adjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vbillcode | 调整单编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | vtrantypecode | 调整类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | ctrantypeid | 调整类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | cwarehouseid | 委外仓 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 9 | cprocesswarehouse | 加工品仓库 | cprocesswarehouse | varchar(20) |  | 仓库 (stordoc) |
| 10 | pk_supplier | 加工商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | ntotalastnum | 总数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 15 | dbilldate | 单据日期 | dbilldate | varchar(19) |  | 日期 (UFDate) |
| 16 | forderstatus | 单据状态 | forderstatus | int |  | 委外单据状态 (enum) |  | 0=自由; |