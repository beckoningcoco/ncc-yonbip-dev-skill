# |<<

**计划订单来源表 (mm_plosource / nc.vo.mmpps.plo.entity.PloSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3733.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cposourceid | 计划订单来源表主键 | cposourceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 7 | nnumber | 主数量 | nnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | nastnum | 数量 | nastnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | vsourcebilltype | 来源单据类型 | vsourcebilltype | varchar(4) |  | 字符串 (String) |
| 10 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 11 | csourcebillid | 来源单据 | csourcebillid | char(20) |  | 主键 (UFID) |
| 12 | csourcebillrowid | 来源单据表体 | csourcebillrowid | char(20) |  | 主键 (UFID) |
| 13 | cfirstbillrowid | 源头单据表体 | cfirstbillrowid | char(20) |  | 主键 (UFID) |
| 14 | cpoid | 计划订单 | cpoid | char(20) |  | 主键 (UFID) |
| 15 | vnote | 备注 | vnote | varchar(200) |  | 备注 (Memo) |
| 16 | cfirstbillid | 源头单据表头 | cfirstbillid | char(20) |  | 主键 (UFID) |
| 17 | fsourcemode | 来源方式 | fsourcemode | int |  | 来源类型 (SourceTypeEnum) |  | 1=计划订单转出; |