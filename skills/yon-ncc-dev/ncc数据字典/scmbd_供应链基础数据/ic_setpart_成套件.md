# |<<

**成套件 (ic_setpart / nc.vo.ic.setpart.entity.SetPartHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_setpart | 成套件主键 | pk_setpart | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 成套件编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | pk_unit | 成套件主单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 公司最新版本 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 7 | pk_org_v | 公司版本 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |