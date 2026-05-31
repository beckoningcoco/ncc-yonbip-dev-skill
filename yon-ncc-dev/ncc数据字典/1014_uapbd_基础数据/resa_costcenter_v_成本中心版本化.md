# |<<

**成本中心版本化 (resa_costcenter_v / nc.vo.resa.vcostcenter.CostCenterVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 成本中心版本化主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_costcenter | 成本中心标识 | pk_costcenter | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | cccode | 编码 | cccode | varchar(50) |  | 字符串 (String) |
| 6 | ccname | 名称 | ccname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | ccshortname | 简称 | ccshortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_father | 上级成本中心 | pk_father | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | pk_principal | 负责人 | pk_principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | cctype | 成本中心类型 | cctype | int |  | 成本中心类型 (costcentertype) |  | 1=费用; |