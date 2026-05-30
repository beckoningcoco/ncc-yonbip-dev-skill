# |<<

**资质信息 (hi_psndoc_natural / nc.vo.hi.psndoc.NaturalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | 0 |  | 字符串 (String) |
| 2 | pk_psndoc | 人员档案主键 | pk_psndoc | 0 |  | 字符串 (String) |
| 3 | begindate | 取得日期 | begindate | 20 |  | 模糊日期 (UFLiteralDate) |
| 4 | enddate | 到期日期 | enddate | 20 |  | 模糊日期 (UFLiteralDate) |
| 5 | recordnum | 记录序号 | recordnum | 1 |  | 整数 (Integer) |
| 6 | lastflag | 最近记录标志 | lastflag | 4 |  | 布尔类型 (UFBoolean) |
| 7 | authorizeway | 授权路径 | authorizeway | 5 |  | 资质授权路径(自定义档案) (Defdoc-HRHI_YL001) |
| 8 | naturalclass | 资质类别 | naturalclass | 5 |  | 资质类别(自定义档案) (Defdoc-HRHI_YL002) |
| 9 | naturalcategory | 所属资质类目 | naturalcategory | 5 |  | 所属资质类目(自定义档案) (Defdoc-HRHI_YL003) |
| 10 | naturalname | 资质名称 | naturalname | 0 |  | 字符串 (String) |
| 11 | naturalcode | 资质编号 | naturalcode | 0 |  | 字符串 (String) |
| 12 | certificatecode | 证书编号 | certificatecode | 0 |  | 字符串 (String) |
| 13 | certificationorg | 发证单位 | certificationorg | 0 |  | 字符串 (String) |
| 14 | authorizedept | 授权部门 | authorizedept | 0 |  | 字符串 (String) |
| 15 | creator | 创建人 | creator | 5 |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | 15 |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | 5 |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | 15 |  | 日期时间 (UFDateTime) |