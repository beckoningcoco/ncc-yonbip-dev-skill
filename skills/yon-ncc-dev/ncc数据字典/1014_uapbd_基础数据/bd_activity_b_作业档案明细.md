# |<<

**作业档案明细 (bd_activity_b / nc.vo.bd.bdactivity.entity.BDActivityBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactivityid_b | 作业档案明细主键 | cactivityid_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pkorg | 组织 | pkorg | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | pk_elementsystem | 要素体系 | pk_elementsystem | varchar(20) |  | 责任会计_要素体系 (elementsystem) |
| 6 | pk_factorchart | 要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 7 | pk_factorasoa | 核算要素 | pk_factorasoa | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | caculatecost | 计算成本 | caculatecost | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |