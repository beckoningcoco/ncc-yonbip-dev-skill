# |<<

**标准成本卷积 (sca_costconv / nc.vo.sca.stdcostconv.ConvolutionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convolution | 标准成本卷积主键 | pk_convolution | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_convscheme | 卷积方案 | pk_convscheme | varchar(20) |  | 卷积方案 (sca_convscheme) |
| 6 | pk_costtype | 成本类型 | pk_costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | convdate | 成本卷积日期 | convdate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | material | 物料范围 | material | int |  | 物料范围 (MaterialEnum) |  | 3=选择物料; |