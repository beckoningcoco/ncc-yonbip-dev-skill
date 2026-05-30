# |<<

**投资计划调整-子表 (ipm_ip_planadjust_b / nc.vo.ipmip.planadjust.PlanAdjustBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planadjust_b | 投资计划调整子表主键 | pk_planadjust_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 项目单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 项目单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 6 | projectname | 项目名称 | projectname | varchar(800) |  | 字符串 (String) |
| 7 | adjust_property | 调整性质 | adjust_property | varchar(50) |  | 字符串 (String) |
| 8 | projectaddr | 项目地点（原计划） | projectaddr | varchar(400) |  | 字符串 (String) |
| 9 | projectaddr_adjust | 项目地点（调整后） | projectaddr_adjust | varchar(400) |  | 字符串 (String) |
| 10 | projectdetail | 项目内容 | projectdetail | varchar(2048) |  | 备注 (Memo) |
| 11 | projectdetail_adjust | 项目内容（调整后） | projectdetail_adjust | varchar(2048) |  | 字符串 (String) |
| 12 | investdir | 投资方向 | investdir | int |  | 投资方向 (InvestDirection) |  | 1=主业; |