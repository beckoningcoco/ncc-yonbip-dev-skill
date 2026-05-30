# |<<

**坏账计提明细 (arap_bdprovision_d / nccloud.vo.arap.bdprovision.BdProvisionDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovision_d | 主键 | pk_bdprovision_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdprovision | 坏账计提主键 | pk_bdprovision | varchar(20) |  | 坏账计提 (bdprovision) |
| 3 | pk_dimratio | 计提比率行主键 | pk_dimratio | char(20) |  | 主键 (UFID) |
| 4 | dim1 | 客户 | dim1 | varchar(20) |  | 客户基本信息 (customer) |
| 5 | dim2 | 客户基本分类 | dim2 | varchar(20) |  | 客户基本分类 (custclass) |
| 6 | dim3 | 信用等级 | dim3 | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 7 | dim4 | 客户类型 | dim4 | int |  | 客户类型 (custprop) |  | 0=外部单位; |