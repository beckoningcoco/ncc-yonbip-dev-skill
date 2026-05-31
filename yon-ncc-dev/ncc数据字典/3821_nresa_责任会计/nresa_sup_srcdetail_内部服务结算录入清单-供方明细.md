# |<<

**内部服务结算录入清单-供方明细 (nresa_sup_srcdetail / nc.vo.nresa.internalsettlent.service.SupSrcDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 明细数据主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_src | 结算录入清单-供方 | pk_src | varchar(20) |  | 内部服务结算录入清单-供方 (SupSrcVO) |
| 3 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | pk_material_v | 物料多版本 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_dest_center | 需方结算利润中心 | pk_dest_center | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_dest_center_v | 需方结算利润中心版本 | pk_dest_center_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_dest_org | 需方结算责任组织 | pk_dest_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 8 | pk_dest_org_v | 需方结算责任组织版本 | pk_dest_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 9 | dest_status | 需方审批状态 | dest_status | int |  | 结算确认清单状态 (DestApplyEnum) |  | -1=自由; |