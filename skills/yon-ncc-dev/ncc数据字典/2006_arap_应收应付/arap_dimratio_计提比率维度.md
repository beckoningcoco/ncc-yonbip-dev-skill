# |<<

**计提比率维度 (arap_dimratio / nccloud.vo.arap.bdprovisionratio.DimRatioVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimratio | 坏账计提比率维度主键 | pk_dimratio | char(20) | √ | 主键 (UFID) |
| 2 | pk_ratioversion | 坏账计提比率版本主键 | pk_ratioversion | varchar(20) |  | 计提比率版本 (ratioversion) |
| 3 | dim1 | 客户 | dim1 | varchar(20) |  | 客户基本信息 (customer) |
| 4 | dim2 | 客户基本分类 | dim2 | varchar(20) |  | 客户基本分类 (custclass) |
| 5 | dim3 | 信用等级 | dim3 | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 6 | dim4 | 客户类型 | dim4 | varchar(50) |  | 客户类型 (custprop) |  | 0=外部单位; |