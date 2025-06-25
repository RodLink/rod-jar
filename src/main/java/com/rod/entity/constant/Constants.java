package com.rod.entity.constant;

/**
 * 通用常量信息
 */
public class Constants {
    //指标--复制链接--前端指标地址
    public static final String FRONT_INDEX_URL = "/indictorDetails/%d-%d";
    //指标--计算公式差值正则
    public static final String INDEX_DF_REGEX = "df[(（][\"“”](.*?)[\"“”][）)]";
    //指标--计算指标实时值正则
    public static final String INDEX_TAG_REGEX = "tag[(（][\"“”](.*?)[\"“”][）)]";
    //指标--计算公式随机正则
    public static final String INDEX_RDM_REGEX = "rdm[(（](\\d+)[,，](\\d+)[）)]";
    //指标--计算公式指标正则
    public static final String INDEX_IDX_REGEX = "idx[(（][\"“”](.*?)[\"“”][）)]";
    //指标--计算公式sql正则
    public static final String INDEX_SQL_REGEX = "sql\\(\"(.*?)\"\\)";
    //指标--指标名称正则
    public static final String INDEX_NAME_REGEX = "[\\(\\)（）]";
    //指标--判断是否是有效的数学公式 正则
    public static final String FORMULA_REGEX = "^[\\d+\\-*/().\\s]+$";
    //指标--报表 idx公式
    public static final String INDEX_REPORT_IDX = "idx[(（](.*)[）)]";
    //指标--报表 tag公式
    public static final String INDEX_REPORT_TAG = "tag[(（](.*)[）)]";
    //交接班日志--tag公式
    public static final String HANDOVER_TAG_REGEX_DATE = "\\{\\{#tag[(（][\"“”](.*)[,，](.*)[\"“”][）)]\\}\\}";
    public static final String HANDOVER_TAG_REGEX = "\\{\\{#tag[(（][\"“”](.*)[\"“”][）)]\\}\\}";
    //数据集报表查询参数正则(字段值 = {{ 值 }})
    public static final String REPORT_DATASET_SQL_PARAM_REGEX = "\\w+\\s*=\\s*\\{\\{\\s*.*\\s*\\}\\}";
    //低代码--页面json模板
    public static final String LOW_CODE_PAGE_CONTENT = "{\"schemaData\":\"{\\\"version\\\":\\\"1.0.0\\\",\\\"componentsMap\\\":[{\\\"devMode\\\":\\\"lowCode\\\",\\\"componentName\\\":\\\"Page\\\"}],\\\"componentsTree\\\":[{\\\"componentName\\\":\\\"Page\\\",\\\"id\\\":\\\"root\\\",\\\"props\\\":{},\\\"fileName\\\":\\\"\\\",\\\"hidden\\\":false,\\\"title\\\":\\\"\\\",\\\"isLocked\\\":false,\\\"condition\\\":true,\\\"conditionGroup\\\":\\\"\\\"}],\\\"i18n\\\":{}}\",\"packagesData\":\"[{\\\"package\\\":\\\"moment\\\",\\\"version\\\":\\\"2.24.0\\\",\\\"urls\\\":[\\\"https://g.alicdn.com/mylib/moment/2.24.0/min/moment.min.js\\\"],\\\"library\\\":\\\"moment\\\"},{\\\"package\\\":\\\"lodash\\\",\\\"library\\\":\\\"_\\\",\\\"urls\\\":[\\\"https://g.alicdn.com/platform/c/lodash/4.6.1/lodash.min.js\\\"]},{\\\"package\\\":\\\"iconfont-icons\\\",\\\"urls\\\":\\\"//at.alicdn.com/t/font_2369445_ukrtsovd92r.js\\\"},{\\\"package\\\":\\\"@ant-design/icons\\\",\\\"version\\\":\\\"4.7.0\\\",\\\"urls\\\":[\\\"//g.alicdn.com/code/npm/@ali/ant-design-icons-cdn/4.5.0/index.umd.min.js\\\"],\\\"library\\\":\\\"icons\\\"},{\\\"package\\\":\\\"antd\\\",\\\"version\\\":\\\"4.19.5\\\",\\\"urls\\\":[\\\"//g.alicdn.com/code/lib/antd/4.23.0/antd.min.js\\\",\\\"//g.alicdn.com/code/lib/antd/4.23.0/antd.min.css\\\"],\\\"library\\\":\\\"antd\\\"},{\\\"title\\\":\\\"fusion组件库\\\",\\\"package\\\":\\\"@alifd/next\\\",\\\"version\\\":\\\"1.26.4\\\",\\\"urls\\\":[\\\"https://g.alicdn.com/code/lib/alifd__next/1.26.4/next.min.css\\\",\\\"https://g.alicdn.com/code/lib/alifd__next/1.26.4/next-with-locales.min.js\\\"],\\\"library\\\":\\\"Next\\\"},{\\\"package\\\":\\\"@alilc/antd-lowcode-materials\\\",\\\"version\\\":\\\"1.2.1\\\",\\\"library\\\":\\\"AntdLowcode\\\",\\\"urls\\\":[\\\"https://alifd.alicdn.com/npm/@alilc/antd-lowcode-materials@1.2.1/build/lowcode/view.js\\\",\\\"https://alifd.alicdn.com/npm/@alilc/antd-lowcode-materials@1.2.1/build/lowcode/view.css\\\"],\\\"editUrls\\\":[\\\"https://alifd.alicdn.com/npm/@alilc/antd-lowcode-materials@1.2.1/build/lowcode/view.js\\\",\\\"https://alifd.alicdn.com/npm/@alilc/antd-lowcode-materials@1.2.1/build/lowcode/view.css\\\"]}]\"}";


    //字典--单位
    public static final String DICT_UNIT = "measure_unit";
    //token 前缀
    public static final String TOKEN_PREFIX = "bearer";
    //token 请求头key
    public static final String TOKEN_KEY = "Authorization";
    //client Type key
    public static final String CLIENT_KEY = "clientKey";
    //登录用户 redis缓存key
    public static final String REDIS_USER_FOLDER = "login_user:";
    //open code redis缓存key
    public static final String REDIS_OPEN_CODE_FOLDER = "open_code:";
    //用户上下文 redis缓存key
    public static final String REDIS_CONTEXT_FOLDER = "user_context:";


    //报表tag表达式缓存过期时间
    public static final long TAG_EXPIRE = 24L * 60 * 60 * 7;
    //编码生成，redis锁前缀
    public static final String CODE_LOCK = "code_lock:";

    /**
     * 编码服务
     */
    //指标：生产计量单编码规则
    public static final String INDEX_TICKET_CODE = "indexTicketCode";
    //指标：生产计量任务编码规则
    public static final String INDEX_TASK_CODE = "indexTaskCode";
    //工艺工序：工艺工序编码规则
    public static final String PROCESS_STEP_CODE = "processStepCode";
    //工单：追踪单编码规则
    public static final String MFG_TRK_CODE = "MFGTRKCode";
    //残料单：编码规则
    public static final String REM_CODE = "ResidueManagementCode";
    //产品单元引擎：产品对象实例编码
    public static final String PRODUCT_INS_CODE = "productInsCode";
    //产品单元引擎：产品载体实例编码
    public static final String PRODUCT_CONTAIN_INS_CODE = "productContainInsCode";


    /**
     * 资源定义
     */
    public static final String RESOURCE_CODE_MONITOR_SQL = "monitorSql";
    public static final String RESOURCE_CODE_SYNCDB_MONITOR = "SyncDbMonitor";
    public static final String RESOURCE_CODE_FACTORY_EQUIPMENT = "factoryEquipment";
    public static final String RESOURCE_CODE_WORK_ORDER= "WorkOrder";
    public static final String RESOURCE_CODE_ORGANIZATION= "organization";
    public static final String RESOURCE_CODE_MATERIAL= "Material";
    public static final String RESOURCE_CODE_MFG_IO ="MfgIo";
//    public static final String RESOURCE_CODE_MATERIAL_ENUM = "MaterialEnum";
    public static final String RESOURCE_CODE_DASHBOARD= "dashboard";
    public static final String RESOURCE_CODE_BASECATEGORY= "baseCategory";
    public static final String RESOURCE_CODE_LABORATORY= "laboratory";
    //消息中心
    public static final String MESSAGE_KEY_TODOWORK_TASK = "todo-task-general";
    public static final String MESSAGE_KEY_INSPECT_TASK = "inspect-task-expire";
    public static final String MESSAGE_KEY_TAG_MONITOR = "tag-monitor-general";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";
    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Fail";


    // 种子租户 id
    public static final String SEED_TENANT_ID = "1";

    /**
     * 指标计算定时任务 执行bean名称
     */
    public static final String INDEX_STATIC_TASK = "indexStaticTask";

    /**
     * 生产监控定时任务 执行bean名称
     */
    public static final String MFG_TASK = "mfgTask";

    // 图片格式
    public final static String[] IMG_TYPES = new String[]{
            "JPG", "BMP", "JPEG", "PNG", "GIF"
    };

    //  视频格式
    public final static String[] VIDEO_TYPES = new String[]{
            "FLV", "MP5", "MP4", "MPG", "MPEG", "AVI",
            "RM", "RMVB", "MOV", "WMV", "ASF", "DAT"
    };

    // 音频格式
    public static final String[] MUSIC_TYPES = new String[]{
            "MP3", "WMA", "RM", "WAV", "MID"
    };

    // 文档格式
    public static final String[] TEXT_TYPES = new String[]{
            "TXT", "DOC", "PPT", "EXCEL", "DOCX",
            "SQL", "XLSX"
    };

    // 压缩格式
    public static final String[] ZIP_TYPES = new String[]{
            "ZIP", "7Z"
    };

    public static final String INDEX_TASK_GROUP_NAME = "指标计算";

    public static final String MFG_TASK_GROUP_NAME = "生产监控";

    public static final String EQUIP_INSPECT_TASK_GROUP_NAME = "设备点巡检";

    public static final String EQUIP_DEFEND_TASK_GROUP_NAME = "设备维保";

    public static final String RULE_ENGINE_NAME = "规则引擎";

    public static final String MONITOR_TASK = "决策指标";
    public static final String HASH_KEY_CONCURRENT_USER_NUM = "concurrent_user_num";

    //工单工作流---流程变量
    public static final String MFG_FLOW_GLOBAL_PARAMS = "globalParams"; //全局参数
    public static final String MFG_FLOW_MFG_CODE = "mfgCode"; //工单编码
    public static final String MFG_FLOW_OPERATE_ID = "operateId"; //工序id
    public static final String MFG_FLOW_ORDER_ID = "orderId"; //工单id
    public static final String MFG_FLOW_EQUIP_ID = "equipId"; //设备id
    public static final String MFG_FLOW_TENANT_ID = "tenantId"; //设备id
    //工单工作流---xml属性
    public static final String MFG_FLOW_OPERATE_TYPE = "operationType";  //工序类型1常规2投料 6参数输入
    public static final String MFG_FLOW_OPERATE_PARAM_INPUT = "operateParamInput"; //operationType = 6参数输入类型
    public static final String MFG_FLOW_FEED_DATA = "feedData";  //投料数据
    public static final String MFG_FLOW_FEED_WAY = "feedWay";  //投料方式 1釜内2釜外 41人工输入42扫码投料
    //工单工作流---任务变量
    public static final String MFG_FLOW_TASK_FORM = "taskForm";  //投料节点投料，前端传参存入到工作流中
    public static final String MFG_FLOW_FEED_MATERIAL_LIST = "mfgTrkList";  //节点所投物料信息 operateParamInput

    public static final String MFG_CHECK_CONTROL = "mfgControl";

    //字符串数据
    public static final String ZERO_STRING = "0";
    public static final String ONE_STRING = "1";
    public static final String TWO_STRING = "2";
    public static final String THREE_STRING = "3";
    public static final String FOUR_STRING = "4";
    public static final String FIVE_STRING = "5";
    public static final String SIX_STRING = "6";
    public static final String SEVEN_STRING = "7";
    public static final String EIGHT_STRING = "8";
    public static final String NINE_STRING = "9";

    //字符串数据
    public static final Integer NEGATIVE_ONE_INTEGER = -1;
    public static final Integer ZERO_INTEGER = 0;
    public static final Integer ONE_INTEGER = 1;
    public static final Integer TWO_INTEGER = 2;
    public static final Integer THREE_INTEGER = 3;
    public static final Integer FOUR_INTEGER = 4;
    public static final Integer FIVE_INTEGER = 5;
    public static final Integer SIX_INTEGER = 6;
    public static final Integer SEVEN_INTEGER = 7;
    public static final Integer EIGHT_INTEGER = 8;
    public static final Integer NINE_INTEGER = 9;
    public static final Integer TEN_INTEGER = 10;
    public static final Integer NINTY_NINE_INTEGER = 99;
    public static final Integer ONE_HANDRAND_INTEGER = 100;

    //常用字符串
    public static final String SHQF = "shqf";
    public static final String CANDIDATE = "candidate";
    public static final String MINO = "Mino";


    //工作流类型
    public static final String OR_TYPE = "or";
    public static final String AND_TYPE = "and";
    public static final String SINGLE_TYPE = "single";
    public static final String UNKNOWN_TYPE = "unknown";

    public static final String UNDISTRIBUTED = "undistributed";

    //MSG_KEY
    public static final String NEXT_USER_MSG = "next_user_msg";

    //时间相关
    public static final long ALARM_DEBOUNCE_INTERVAL = 60 * 1000;

    public static final String TAG_LATEST_VALUE_PREFIX = "tag:";

    //websocket Msg Key
    public static final String EVENT_WARNING = "eventWarning";
    public static final String MSG_SEND = "msgSend";

    public static final String TAG_CURRENT_PREFIX = "tag:";

    public static final String TAG_TIME_PREFIX = "tag:";



    //兴邦对接-安捷汇
    public static final String AJH_URL = "http://www.idatatank.com/ls";
    public static final String AJH_ORG_KEY = "PT_ZU1BZ";
    public static final String AJH_TOKEN_KEY = "uvRQzpGlKuyBEgCQgqWbBJAgDUwy7Dx0rjiIPMmpW7gZVskbpjO4s86IpYDlGCz1";
    public static final String TANK_LIST = "/openapi/server/tank/list";
    public static final String TANK_DETAIL = "/openapi/server/tank/details/";//查询单个贮罐信息
    public static final String TANK_HISTORY = "/openapi/server/tank/history";//查询贮罐的历史数据
    public static final String DYNAMIC_4_TANKDETAIL = "dynamic_4_tankdetail";//查询贮罐的历史数据

    //规则引擎
    public static final String ROW = "ROW";
    public static final String AGG = "AGG";
    public static final String GROUP = "GROUP";
    public static final String ROWS = "rows";
    public static final String SCRIPT = "SCRIPT";
    public static final String PYTHON = "python";
    public static final String RESULT = "result";
    public static final String ADVANCED = "ADVANCED";

    // 兴邦对接-车辆信息
    public static final String VEHICLE_URL = "http://59.53.213.182:8088/topgps/services/TopDataService.ashx";
    public static final String DYNAMIC_4_VEHICLESTATUSOO = "dynamic_4_vehicleStatusoo";//查询贮罐的历史数据
    public static final String VEHICLE_ACTION = "GetVehicleGpsInfo";
    public static final String VEHICLE_USERID = "兴邦物流";
    public static final String VEHICLE_PASSWORD = "3518E0F42FA30B9BCD1F666F59698D88";
    public static final String VEHICLE_NEEDADDRESS = "0";


    public static final String DYNAMIC_URL_1 = "/mfg/findManufacturingOrderListForPaging";
}


