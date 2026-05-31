# |<<

**物料_医疗属性_零售价加成维护 (bd_uh_pd_pap / com.yonyou.yh.nhis.scm.pd.vo.UHPdPapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpap | 零售价加成率主键 | pk_pdpap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | eu_pdtype | 物品类型 | eu_pdtype | int |  | 物品类型 (PdTypeEnum) |  | 0=药品; |