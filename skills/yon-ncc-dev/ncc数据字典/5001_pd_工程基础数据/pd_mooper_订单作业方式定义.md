# |<<

**订单作业方式定义 (pd_mooper / nc.vo.pd.mooper.entity.MooperVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmooperid | 订单作业方式定义 | cmooperid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cfactoryid | 工厂最新版本 | cfactoryid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | cfactoryvid | 工厂 | cfactoryvid | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialclassid | 物料分类 | cmaterialclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | fmobilltype | 生产订单类型 | fmobilltype | int |  | 生产订单类型 (MobillTypeEnum) |  | 1=流程生产订单; |