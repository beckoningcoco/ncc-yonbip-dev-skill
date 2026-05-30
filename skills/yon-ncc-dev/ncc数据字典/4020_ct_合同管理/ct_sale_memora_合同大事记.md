# |<<

**合同大事记 (ct_sale_memora / nc.vo.ct.saledaily.entity.CtSaleMemoraVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_sale_memora | 大事记主键 | pk_ct_sale_memora | char(20) | √ | 主键 (UFID) |
| 2 | vmemoracode | 大事记编码 | vmemoracode | varchar(30) |  | 字符串 (String) |
| 3 | vmemora | 大事记内容 | vmemora | varchar(50) |  | 字符串 (String) |
| 4 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 5 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |