# |<<

**固定收费定义_服务项目 (bd_uh_daycg_set_srv / com.yonyou.yh.nhis.bd.phcosts.vo.PdSetDtVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_daycgsetsrv | 固定收费套服务项目主键 | pk_daycgsetsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_daycgsetsrv | 固定收费套服务项目主键 | pk_daycgsetsrv | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_daycgset | 固定收费套 | pk_daycgset | varchar(20) |  | 固定收费项目维护 (PdCgSetVo) |
| 6 | pk_item | 收费项目 | pk_item | varchar(50) |  | 字符串 (String) |
| 7 | month_begin | 有效月份_开始 | month_begin | int |  | 整数 (Integer) |
| 8 | month_end | 有效月份_结束 | month_end | int |  | 整数 (Integer) |
| 9 | day_end | 有效日期_结束 | day_end | int |  | 整数 (Integer) |
| 10 | day_begin | 有效日期_开始 | day_begin | int |  | 整数 (Integer) |
| 11 | describe | 固定收费项目描述 | describe | varchar(256) |  | 字符串 (String) |
| 12 | eu_cgmode | 固定收费方式 | eu_cgmode | varchar(50) |  | 固定收费方式 (enum) |  | 0=按人收费; |